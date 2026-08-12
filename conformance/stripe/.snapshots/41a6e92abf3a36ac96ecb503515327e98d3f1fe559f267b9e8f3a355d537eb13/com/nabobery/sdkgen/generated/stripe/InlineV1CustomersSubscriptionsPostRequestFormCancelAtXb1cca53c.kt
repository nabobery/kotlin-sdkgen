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

public enum class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2).count { it }
}

/**
 * A timestamp at which the subscription should cancel. If set to a date before the current period ends, this will cause
 * a proration if prorations have been enabled using `proration_behavior`. If set during a future period, this will
 * always cause a proration for that period.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/cancel_at
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2:
      InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2) add(InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cBranch.InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53c(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2>()
  return InlineV1CustomersSubscriptionsPostRequestFormCancelAtXb1cca53cInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2 = matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2) add("InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2: value does not match InlineV1CustomersSubscriptionsPostRequestFormCancelAtAnyOf2Xa8dc1ed2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
