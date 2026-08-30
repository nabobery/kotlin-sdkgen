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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Branch {
  Branch1,
  InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5NoMatchException(
  message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5DecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amo
 * unt.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/amo
 * unt
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Inspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc) add(InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Branch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5 {
      val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5NoMatchException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5(element: JsonElement): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Inspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc>()
  return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAmountX19dbe9a5Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc) add("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2X244c57cc")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
