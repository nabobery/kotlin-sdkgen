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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeBranch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_at.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/expires_at
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae:
      InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae) add(InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeBranch.InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573ae(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae>()
  return InlineV1PaymentIntentsConfirmPostRequestFormExpiresAtX1db573aeInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae = matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae) add("InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae: value does not match InlineV1PaymentIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xa7f78eae")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
