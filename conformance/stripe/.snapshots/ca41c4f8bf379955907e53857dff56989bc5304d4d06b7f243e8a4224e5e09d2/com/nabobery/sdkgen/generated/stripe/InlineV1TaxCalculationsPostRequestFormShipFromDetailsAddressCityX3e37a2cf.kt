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

public enum class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfBranch {
  Branch1,
  InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0,
}

public sealed class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfNoMatchException(
  message: String,
) : InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfDecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/city.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/ship_from_details/properties/address/properties/city
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0:
      InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0) json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfBranch.Branch1)
      if (inspection.matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0) add(InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfBranch.InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf {
      val inspection = inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfNoMatchException("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf) {
      encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cf(element: JsonElement): InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0 = element.isJsonDecodable<InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0>()
  return InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityX3e37a2cfInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0 = matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0) add("InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0: value does not match InlineV1TaxCalculationsPostRequestFormShipFromDetailsAddressCityAnyOf2X502c4af0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
