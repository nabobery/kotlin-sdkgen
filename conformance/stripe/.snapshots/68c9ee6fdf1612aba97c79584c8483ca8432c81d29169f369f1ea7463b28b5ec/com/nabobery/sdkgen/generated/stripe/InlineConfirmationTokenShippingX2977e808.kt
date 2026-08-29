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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineConfirmationTokenShippingX2977e808Branch {
  ConfirmationTokensResourceShipping,
}

public sealed class InlineConfirmationTokenShippingX2977e808DecodingException(
  message: String,
) : SerializationException(message)

public class InlineConfirmationTokenShippingX2977e808NoMatchException(
  message: String,
) : InlineConfirmationTokenShippingX2977e808DecodingException(message)

internal data class InlineConfirmationTokenShippingX2977e808Inspection(
  public val matchesConfirmationTokensResourceShipping: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConfirmationTokensResourceShipping).count { it }
}

/**
 * Shipping information collected on this ConfirmationToken.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token/properties/shipping
 */
@Serializable(with = InlineConfirmationTokenShippingX2977e808.Serializer::class)
public class InlineConfirmationTokenShippingX2977e808 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineConfirmationTokenShippingX2977e808Inspection,
) {
  public val confirmationTokensResourceShipping: ConfirmationTokensResourceShippingView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConfirmationTokensResourceShipping) json.decodeFromJsonElement<ConfirmationTokensResourceShippingView>(raw) else null }

  public val matchedBranches: Set<InlineConfirmationTokenShippingX2977e808Branch>
    get() = buildSet {
      if (inspection.matchesConfirmationTokensResourceShipping) add(InlineConfirmationTokenShippingX2977e808Branch.ConfirmationTokensResourceShipping)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineConfirmationTokenShippingX2977e808 {
      val inspection = inspectInlineConfirmationTokenShippingX2977e808(raw)
      if (inspection.matchCount == 0) {
        throw InlineConfirmationTokenShippingX2977e808NoMatchException("InlineConfirmationTokenShippingX2977e808 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineConfirmationTokenShippingX2977e808(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineConfirmationTokenShippingX2977e808> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConfirmationTokenShippingX2977e808 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConfirmationTokenShippingX2977e808")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokenShippingX2977e808) {
      encoder.requireJsonEncoder("InlineConfirmationTokenShippingX2977e808").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineConfirmationTokenShippingX2977e808(element: JsonElement): InlineConfirmationTokenShippingX2977e808Inspection {
  val raw = element as? JsonObject ?: return InlineConfirmationTokenShippingX2977e808Inspection(
    matchesConfirmationTokensResourceShipping = false,
    failures = listOf("ConfirmationTokensResourceShipping: expected JSON object"),
  )
  val matchesConfirmationTokensResourceShipping = raw["address"] != null && raw["name"].isString()
  return InlineConfirmationTokenShippingX2977e808Inspection(
    matchesConfirmationTokensResourceShipping = matchesConfirmationTokensResourceShipping,
    failures = buildList {
      if (!matchesConfirmationTokensResourceShipping) add("ConfirmationTokensResourceShipping: required properties 'address', 'name' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
