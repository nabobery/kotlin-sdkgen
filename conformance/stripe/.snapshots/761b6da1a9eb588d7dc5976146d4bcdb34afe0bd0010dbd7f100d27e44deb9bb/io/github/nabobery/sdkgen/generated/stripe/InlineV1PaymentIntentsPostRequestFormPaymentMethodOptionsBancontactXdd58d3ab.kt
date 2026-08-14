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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bancontact.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/bancontact
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3ab(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsBancontactXdd58d3abInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf1Xf95e8f00")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAnyOf2Xfae03e83")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
