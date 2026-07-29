package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlinePlanProductXfe94cf9aBranch {
  Branch1,
  Product,
  DeletedProduct,
}

public sealed class InlinePlanProductXfe94cf9aDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePlanProductXfe94cf9aNoMatchException(
  message: String,
) : InlinePlanProductXfe94cf9aDecodingException(message)

internal data class InlinePlanProductXfe94cf9aInspection(
  public val matchesBranch1: Boolean,
  public val matchesProduct: Boolean,
  public val matchesDeletedProduct: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesProduct, matchesDeletedProduct).count { it }
}

/**
 * The product whose pricing this plan determines.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/plan/properties/product
 */
@Serializable(with = InlinePlanProductXfe94cf9a.Serializer::class)
public class InlinePlanProductXfe94cf9a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePlanProductXfe94cf9aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val product: Product? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesProduct) json.decodeFromJsonElement<Product>(raw) else null }

  public val deletedProduct: DeletedProduct? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedProduct) json.decodeFromJsonElement<DeletedProduct>(raw) else null }

  public val matchedBranches: Set<InlinePlanProductXfe94cf9aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePlanProductXfe94cf9aBranch.Branch1)
      if (inspection.matchesProduct) add(InlinePlanProductXfe94cf9aBranch.Product)
      if (inspection.matchesDeletedProduct) add(InlinePlanProductXfe94cf9aBranch.DeletedProduct)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePlanProductXfe94cf9a {
      val inspection = inspectInlinePlanProductXfe94cf9a(raw)
      if (inspection.matchCount == 0) {
        throw InlinePlanProductXfe94cf9aNoMatchException("InlinePlanProductXfe94cf9a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePlanProductXfe94cf9a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlinePlanProductXfe94cf9a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePlanProductXfe94cf9a {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePlanProductXfe94cf9a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePlanProductXfe94cf9a) {
      encoder.requireJsonEncoder("InlinePlanProductXfe94cf9a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePlanProductXfe94cf9a(element: JsonElement): InlinePlanProductXfe94cf9aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesProduct = element.isJsonDecodable<Product>()
  val matchesDeletedProduct = element.isJsonDecodable<DeletedProduct>()
  return InlinePlanProductXfe94cf9aInspection(
    matchesBranch1 = matchesBranch1,
    matchesProduct = matchesProduct,
    matchesDeletedProduct = matchesDeletedProduct,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesProduct) add("Product: value does not match Product")
      if (!matchesDeletedProduct) add("DeletedProduct: value does not match DeletedProduct")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
