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

public enum class InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aBranch {
  Branch1,
  InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a,
}

public sealed class InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aNoMatchException(
  message: String,
) : InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aDecodingException(message)

internal data class InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a).count { it }
}

/**
 * The time when the billing credits created by this credit grant expire. If set to empty, the billing credits never
 * expire.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1billing~1credit_grants~1{id}/post/requestBody/content/application~1x-www-fo
 * rm-urlencoded/schema/properties/expires_at
 */
@Serializable(with = InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a.Serializer::class)
public class InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a:
      InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a) json.decodeFromJsonElement<InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aBranch.Branch1)
      if (inspection.matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a) add(InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aBranch.InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a {
      val inspection = inspectInlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aNoMatchException("InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a) {
      encoder.requireJsonEncoder("InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691a(element: JsonElement): InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a = element.isJsonDecodable<InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a>()
  return InlineV1BillingCreditGrantsPostRequestFormExpiresAtXdc77691aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a = matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a) add("InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a: value does not match InlineV1BillingCreditGrantsPostRequestFormExpiresAtAnyOf2Xb368985a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
