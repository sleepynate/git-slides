

// IMMUTABILITY
// 
// 
// Advantages:
// 
// - Easier to test                                    (no setup)
// - Easier to reason about behaviour                (no globals)
// - Easier to reason about the impact of changes      (no order)
// - Easier to write parallel programs       (no race conditions)
// 
// Disadvantages:
// 
// - immutability is visible in the API     (not an impl. detail)
// - not compatible with existing libraries     (the GUI debacle)
// - need new immutable datastructures  (slower big-O complexity)
// 
