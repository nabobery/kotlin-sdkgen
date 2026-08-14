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

public enum class InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bBranch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bNoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/custom_manda
 * te_url.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/acss_debit/properties/mandate_options/properties/custom_manda
 * te_url
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bBranch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0) add(InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bBranch.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bNoMatchException("InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0b(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0 = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0>()
  return InlineV1CheckoutSessionsPostRequestFormCustomMandateUrlXf8865a0bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0 = matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0) add("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0: value does not match InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsAnyOf2Xd2a7dbc0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
