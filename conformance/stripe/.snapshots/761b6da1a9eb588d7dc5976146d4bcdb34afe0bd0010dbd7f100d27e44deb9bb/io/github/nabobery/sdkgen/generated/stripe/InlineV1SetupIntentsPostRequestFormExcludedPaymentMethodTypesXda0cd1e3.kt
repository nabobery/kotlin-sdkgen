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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Branch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd,
}

public sealed class InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3NoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3DecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd).count { it }
}

/**
 * The list of payment method types to exclude from use with this SetupIntent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents~1{intent}/post/requestBody/content/application~1x-www-form-ur
 * lencoded/schema/properties/excluded_payment_method_types
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Inspection,
) {
  public val branch1:
      List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf1ItemX9aab29d8>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf1ItemX9aab29d8>>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd:
      InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Branch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd) add(InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Branch.InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3 {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3NoMatchException("InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3(element: JsonElement): InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Inspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf1ItemX9aab29d8>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd>()
  return InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesXda0cd1e3Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd = matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd) add("InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd: value does not match InlineV1SetupIntentsPostRequestFormExcludedPaymentMethodTypesAnyOf2X526274fd")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
