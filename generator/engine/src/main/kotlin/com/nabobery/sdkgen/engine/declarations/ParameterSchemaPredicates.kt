package com.nabobery.sdkgen.engine.declarations

import com.nabobery.sdkgen.model.CompositionKind
import com.nabobery.sdkgen.model.SchemaModel
import com.nabobery.sdkgen.model.SchemaRef

/**
 * The schema shapes a parameter position can serialize, as pure predicates over a dereferenced schema.
 *
 * These decide which OpenAPI parameter schemas are representable at all, and they are read and changed
 * together -- ADR 0016 moved through every one of them at once. They lived in the middle of
 * `StandardProjection`, a file whose subject is projecting an entire document, where the rule that a path
 * parameter may not carry an array branch sat two thousand lines from the rule that a query parameter may.
 *
 * Each takes a `dereference` function rather than the projection's context object. The predicates need exactly
 * one capability from that context, and depending on the function instead of the object keeps them testable on
 * their own and leaves the context file-private, which it should stay: widening it to move this code would
 * have traded a large file for a wider-reaching abstraction.
 */
internal object ParameterSchemaPredicates {
    private val PRIMITIVE_PARAMETER_SCHEMA_TYPES = setOf("string", "integer", "number", "boolean")

    /** A single primitive scalar: the only shape every parameter position can always carry. */
    internal fun isPrimitiveParameterSchema(schema: SchemaModel): Boolean {
        val types = schema.types.filterNot { type -> type == "null" }.distinct()
        return types.size == 1 &&
            types.single() in PRIMITIVE_PARAMETER_SCHEMA_TYPES &&
            schema.items == null &&
            schema.properties.isEmpty() &&
            schema.additionalProperties == null &&
            schema.compositions.isEmpty()
    }

    /** An array whose items are primitive scalars. */
    internal fun isPrimitiveParameterArray(
        schema: SchemaModel,
        dereference: (SchemaRef) -> SchemaModel,
    ): Boolean = schema.items?.let(dereference)?.let(::isPrimitiveParameterSchema) == true

    /**
     * A `oneOf` over branches that are each a primitive scalar or an array of primitive scalars.
     *
     * Such a union collapses onto a *repeated* wire position -- a scalar branch contributes one value, an array
     * branch one per element -- so the caller's branch choice is not observable there. See ADR 0016.
     *
     * "Repeated" is the load-bearing word and it is not true of every position that accepts a union. A query
     * parameter with `style: form, explode: true` is a repeated key and can carry any of these branches; a path
     * segment carries exactly one value and can only carry the scalar ones. Callers in a single-value position
     * must additionally reject [unionHasArrayBranch]. Branches accepting only null are ignored, matching
     * `projectPrimitiveOneOf`, which is what gives these schemas their generated sealed type.
     */
    internal fun isPrimitiveParameterUnion(
        schema: SchemaModel,
        dereference: (SchemaRef) -> SchemaModel,
    ): Boolean {
        val composition = schema.compositions.singleOrNull() ?: return false
        if (composition.kind != CompositionKind.ONE_OF) return false
        if (schema.properties.isNotEmpty() || schema.additionalProperties != null) return false
        val branches =
            composition.branches
                .map(dereference)
                .filterNot { branch -> branch.acceptsOnlyNull }
        if (branches.isEmpty()) return false
        return branches.all { branch ->
            isPrimitiveParameterSchema(branch) || isPrimitiveParameterArray(branch, dereference)
        }
    }

    /**
     * Whether any branch of an [isPrimitiveParameterUnion] schema is an array rather than a scalar.
     *
     * Such a branch expands to zero or many wire values, which a single-value position cannot render.
     */
    internal fun unionHasArrayBranch(
        schema: SchemaModel,
        dereference: (SchemaRef) -> SchemaModel,
    ): Boolean =
        schema.compositions
            .singleOrNull()
            ?.branches
            ?.map(dereference)
            ?.filterNot { branch -> branch.acceptsOnlyNull }
            ?.any { branch -> isPrimitiveParameterArray(branch, dereference) } == true

    /** A Stripe idiom: an `anyOf` with at least one scalar branch, carried in a `deepObject` position. */
    internal fun hasStripeCompatibleDeepObjectScalarBranch(
        schema: SchemaModel,
        dereference: (SchemaRef) -> SchemaModel,
    ): Boolean {
        val composition =
            schema.compositions.singleOrNull { item -> item.kind == CompositionKind.ANY_OF } ?: return false
        if (schema.compositions.size != 1) return false
        return composition.branches.any { branch -> isPrimitiveParameterSchema(dereference(branch)) }
    }
}
