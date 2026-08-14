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

public enum class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fBranch {
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84,
}

public sealed class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fInspection(
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83:
      Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/affirm.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/payment_method_options/properties/affirm
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fInspection,
) {
  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84) add(InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fNoMatchException("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074f(element: JsonElement): InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fInspection {
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84>()
  return InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmX9e5f074fInspection(
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84,
    failures = buildList {
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf1X2a78db83")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsAffirmAnyOf2Xc052ce84")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
