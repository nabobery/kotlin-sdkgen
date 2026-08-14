package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Branch {
  ConfirmationTokensResourcePaymentMethodOptions,
}

public sealed class InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3NoMatchException(
  message: String,
) : InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3DecodingException(message)

internal data class InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Inspection(
  public val matchesConfirmationTokensResourcePaymentMethodOptions: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesConfirmationTokensResourcePaymentMethodOptions).count { it }
}

/**
 * Payment-method-specific configuration for this ConfirmationToken.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/confirmation_token/properties/payment_method_options
 */
@Serializable(with = InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3.Serializer::class)
public class InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Inspection,
) {
  public val confirmationTokensResourcePaymentMethodOptions:
      ConfirmationTokensResourcePaymentMethodOptionsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesConfirmationTokensResourcePaymentMethodOptions) json.decodeFromJsonElement<ConfirmationTokensResourcePaymentMethodOptionsView>(raw) else null }

  public val matchedBranches: Set<InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Branch>
    get() = buildSet {
      if (inspection.matchesConfirmationTokensResourcePaymentMethodOptions) add(InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Branch.ConfirmationTokensResourcePaymentMethodOptions)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3 {
      val inspection = inspectInlineConfirmationTokenPaymentMethodOptionsX0b4c12e3(raw)
      if (inspection.matchCount == 0) {
        throw InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3NoMatchException("InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3) {
      encoder.requireJsonEncoder("InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineConfirmationTokenPaymentMethodOptionsX0b4c12e3(element: JsonElement): InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Inspection {
  val raw = element as? JsonObject ?: return InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Inspection(
    matchesConfirmationTokensResourcePaymentMethodOptions = false,
    failures = listOf("ConfirmationTokensResourcePaymentMethodOptions: expected JSON object"),
  )
  val matchesConfirmationTokensResourcePaymentMethodOptions = true
  return InlineConfirmationTokenPaymentMethodOptionsX0b4c12e3Inspection(
    matchesConfirmationTokensResourcePaymentMethodOptions = matchesConfirmationTokensResourcePaymentMethodOptions,
    failures = buildList {
      if (!matchesConfirmationTokensResourcePaymentMethodOptions) add("ConfirmationTokensResourcePaymentMethodOptions: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
