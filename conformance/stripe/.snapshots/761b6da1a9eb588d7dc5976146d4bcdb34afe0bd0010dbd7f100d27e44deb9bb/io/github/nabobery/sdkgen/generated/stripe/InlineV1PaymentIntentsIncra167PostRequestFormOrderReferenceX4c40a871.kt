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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Branch {
  Branch1,
  InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871NoMatchException(
  message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871DecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details/properties/order_reference.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/payment_details/properties/order_reference
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f:
      InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f) json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f) add(InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Branch.InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871 {
      val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871NoMatchException("InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871(element: JsonElement): InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f = element.isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f>()
  return InlineV1PaymentIntentsIncra167PostRequestFormOrderReferenceX4c40a871Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f = matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f) add("InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f: value does not match InlineV1PaymentIntentsIncra167PostRequestFormPaymentDetailsAnyOf2Xd93c752f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
