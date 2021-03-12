#!/usr/bin/env python3

def areAnagrams(str1, str2):
	str1 = str1.lower().replace(" ", "")
	str2 = str2.lower().replace(" ", "")

	found_letters = dict()

	for letter in str1:
		if(letter not in found_letters):
			found_letters[letter] = 1
		else:
			found_letters[letter] += 1

	for letter in str2:
		if(letter not in found_letters):
			return False
		found_letters[letter] -= 1

	for key in found_letters:
		if(found_letters[key] != 0):
			return False

	return True 

if(__name__ == "__main__"):
	str1 = input("First String: ")
	str2 = input("Second String: ")
	print(f'\"{str1}\" and \"{str2}\" are { "" if areAnagrams(str1, str2) else "not " }anagrams.')
