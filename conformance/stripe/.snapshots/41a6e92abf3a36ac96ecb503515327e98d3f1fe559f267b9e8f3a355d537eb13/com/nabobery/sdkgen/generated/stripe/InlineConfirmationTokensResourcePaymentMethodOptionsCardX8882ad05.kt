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

public enum class InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Branch {
  ConfirmationTokensResourcePaymentMethodOptionsResourceCard,
}

public sealed class InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05DecodingException(
  message: String,
) : SerializationException(message)

public class InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05NoMatchException(
  message: String,
) : InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05DecodingException(message)

internal data class InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Inspection(
  public val matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard).count { it }
}

/**
 * This hash contains the card payment method options.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/confirmation_tokens_resource_payment_method_options/properties/card
 */
@Serializable(with = InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05.Serializer::class)
public class InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Inspection,
) {
  public val confirmationTokensResourcePaymentMethodOptionsResourceCard:
      ConfirmationTokensResourcePaymentMethodOptionsResourceCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard) json.decodeFromJsonElement<ConfirmationTokensResourcePaymentMethodOptionsResourceCardView>(raw) else null }

  public val matchedBranches:
      Set<InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Branch>
    get() = buildSet {
      if (inspection.matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard) add(InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Branch.ConfirmationTokensResourcePaymentMethodOptionsResourceCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05 {
      val inspection = inspectInlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05(raw)
      if (inspection.matchCount == 0) {
        throw InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05NoMatchException("InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05) {
      encoder.requireJsonEncoder("InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05(element: JsonElement): InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Inspection {
  val raw = element as? JsonObject ?: return InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Inspection(
    matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard = false,
    failures = listOf("ConfirmationTokensResourcePaymentMethodOptionsResourceCard: expected JSON object"),
  )
  val matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard = true
  return InlineConfirmationTokensResourcePaymentMethodOptionsCardX8882ad05Inspection(
    matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard = matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard,
    failures = buildList {
      if (!matchesConfirmationTokensResourcePaymentMethodOptionsResourceCard) add("ConfirmationTokensResourcePaymentMethodOptionsResourceCard: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
