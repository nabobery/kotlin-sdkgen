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

public enum class InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dBranch {
  KlarnaPayerDetails,
}

public sealed class InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dNoMatchException(
  message: String,
) : InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dDecodingException(message)

internal data class InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dInspection(
  public val matchesKlarnaPayerDetails: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesKlarnaPayerDetails).count { it }
}

/**
 * The payer details for this transaction.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_method_details_klarna/properties/payer_details
 */
@Serializable(with = InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d.Serializer::class)
public class InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dInspection,
) {
  public val klarnaPayerDetails: KlarnaPayerDetailsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesKlarnaPayerDetails) json.decodeFromJsonElement<KlarnaPayerDetailsView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dBranch>
    get() = buildSet {
      if (inspection.matchesKlarnaPayerDetails) add(InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dBranch.KlarnaPayerDetails)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d {
      val inspection = inspectInlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dNoMatchException("InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d) {
      encoder.requireJsonEncoder("InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6d(element: JsonElement): InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dInspection {
  val raw = element as? JsonObject ?: return InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dInspection(
    matchesKlarnaPayerDetails = false,
    failures = listOf("KlarnaPayerDetails: expected JSON object"),
  )
  val matchesKlarnaPayerDetails = true
  return InlinePaymentMethodDetailsKlarnaPayerDetailsXe373db6dInspection(
    matchesKlarnaPayerDetails = matchesKlarnaPayerDetails,
    failures = buildList {
      if (!matchesKlarnaPayerDetails) add("KlarnaPayerDetails: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
