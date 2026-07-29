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

public enum class InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c,
}

public sealed class InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c).count { it }
}

/**
 * Set to `true` to indicate that the customer isn't in your checkout flow during this payment attempt and can't
 * authenticate. Use this parameter in scenarios where you collect payment method details and [charge them
 * later](https://docs.stripe.com/payments/save-during-payment). This parameter can only be used with
 * [`confirm=true`](https://docs.stripe.com/api/payment_intents/create#create_payment_intent-confirm).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/off_session
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecInspection,
) {
  public val branch1: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Boolean>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c:
      InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c) add(InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecBranch.InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecNoMatchException("InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormOffSessionXa86bacec(element: JsonElement): InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecInspection {
  val matchesBranch1 = element.isJsonDecodable<Boolean>()
  val matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c>()
  return InlineV1PaymentIntentsPostRequestFormOffSessionXa86bacecInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c = matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Boolean")
      if (!matchesInlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c) add("InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c: value does not match InlineV1PaymentIntentsPostRequestFormOffSessionAnyOf2X04ff617c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
