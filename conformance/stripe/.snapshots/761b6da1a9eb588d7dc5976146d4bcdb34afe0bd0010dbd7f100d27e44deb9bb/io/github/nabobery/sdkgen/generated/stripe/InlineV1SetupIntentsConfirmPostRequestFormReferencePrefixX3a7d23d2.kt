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

public enum class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Branch {
  Branch1,
  InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2NoMatchException(
  message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2DecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options/propertie
 * s/reference_prefix.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_options/properties/sepa_debit/properties/mandate_options/propertie
 * s/reference_prefix
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b) add(InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Branch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2 {
      val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2NoMatchException("InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2(element: JsonElement): InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b>()
  return InlineV1SetupIntentsConfirmPostRequestFormReferencePrefixX3a7d23d2Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b) add("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodOptionsAnyOf2Xe037053b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
