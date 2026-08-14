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

public enum class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Branch {
  InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c,
  InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6,
}

public sealed class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209NoMatchException(
  message: String,
) : InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209DecodingException(message)

internal data class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Inspection(
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c:
      Boolean,
  public val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c, matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}~1confirm/post/requestBody/content/application~1x-ww
 * w-form-urlencoded/schema/properties/payment_method_data/properties/billing_details/properties/address
 */
@Serializable(with = InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209.Serializer::class)
public class InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Inspection,
) {
  public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c>(raw) else null }

  public val inlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6:
      InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6) json.decodeFromJsonElement<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c) add(InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Branch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c)
      if (inspection.matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6) add(InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Branch.InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209 {
      val inspection = inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209NoMatchException("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209(element: JsonElement): InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Inspection {
  val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c>()
  val matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6 = element.isJsonDecodable<InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6>()
  return InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAddressXa3bec209Inspection(
    matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c,
    matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6 = matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6,
    failures = buildList {
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c) add("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf1X7797ac7c")
      if (!matchesInlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6) add("InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6: value does not match InlineV1SetupIntentsConfirmPostRequestFormPaymentMethodDataAnyOf2X0eb3c6b6")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
