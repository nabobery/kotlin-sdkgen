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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/start_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/start_date
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a:
      InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a) add(InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Branch.InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8NoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoStartDateX6b0806d8Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a) add("InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodOptionsPaytoAnyOf2Xc0c8eb7a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
