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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabBranch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabNoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabDecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2).count { it }
}

/**
 * Set to `true` to indicate that the customer isn't in your checkout flow during this payment attempt and can't
 * authenticate. Use this parameter in scenarios where you collect payment method details and [charge them
 * later](https://docs.stripe.com/payments/save-during-payment).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/off_session
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabInspection,
) {
  public val branch1: Boolean? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Boolean>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2:
      InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2) add(InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabBranch.InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabNoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eab(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabInspection {
  val matchesBranch1 = element.isJsonDecodable<Boolean>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2>()
  return InlineV1PaymentIntentsConfirmPostRequestFormOffSessionX26a94eabInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2 = matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Boolean")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2) add("InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2: value does not match InlineV1PaymentIntentsConfirmPostRequestFormOffSessionAnyOf2X477c0ad2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
