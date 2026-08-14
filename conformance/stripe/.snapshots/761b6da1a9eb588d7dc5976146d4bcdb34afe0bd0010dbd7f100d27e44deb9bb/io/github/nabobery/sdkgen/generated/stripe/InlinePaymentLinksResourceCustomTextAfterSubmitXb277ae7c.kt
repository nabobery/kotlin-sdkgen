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

public enum class InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cBranch {
  PaymentLinksResourceCustomTextPosition,
}

public sealed class InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cDecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cNoMatchException(
  message: String,
) : InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cDecodingException(message)

internal data class InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cInspection(
  public val matchesPaymentLinksResourceCustomTextPosition: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesPaymentLinksResourceCustomTextPosition).count { it }
}

/**
 * Custom text that should be displayed after the payment confirmation button.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_links_resource_custom_text/properties/after_submit
 */
@Serializable(with = InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c.Serializer::class)
public class InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cInspection,
) {
  public val paymentLinksResourceCustomTextPosition: PaymentLinksResourceCustomTextPositionView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesPaymentLinksResourceCustomTextPosition) json.decodeFromJsonElement<PaymentLinksResourceCustomTextPositionView>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cBranch>
    get() = buildSet {
      if (inspection.matchesPaymentLinksResourceCustomTextPosition) add(InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cBranch.PaymentLinksResourceCustomTextPosition)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c {
      val inspection = inspectInlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cNoMatchException("InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c) {
      encoder.requireJsonEncoder("InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7c(element: JsonElement): InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cInspection {
  val raw = element as? JsonObject ?: return InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cInspection(
    matchesPaymentLinksResourceCustomTextPosition = false,
    failures = listOf("PaymentLinksResourceCustomTextPosition: expected JSON object"),
  )
  val matchesPaymentLinksResourceCustomTextPosition = raw["message"].isString()
  return InlinePaymentLinksResourceCustomTextAfterSubmitXb277ae7cInspection(
    matchesPaymentLinksResourceCustomTextPosition = matchesPaymentLinksResourceCustomTextPosition,
    failures = buildList {
      if (!matchesPaymentLinksResourceCustomTextPosition) add("PaymentLinksResourceCustomTextPosition: required properties 'message' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
