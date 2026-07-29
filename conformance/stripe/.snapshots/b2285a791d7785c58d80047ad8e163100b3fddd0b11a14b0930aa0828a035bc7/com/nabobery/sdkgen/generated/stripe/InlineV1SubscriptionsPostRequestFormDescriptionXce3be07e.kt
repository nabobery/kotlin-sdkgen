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

public enum class InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eBranch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c,
}

public sealed class InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eNoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eDecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c).count { it }
}

/**
 * The subscription's description, meant to be displayable to the customer. Use this field to optionally store an
 * explanation of the subscription for rendering in Stripe surfaces and certain local payment methods UIs.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/description
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c:
      InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c) add(InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eBranch.InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormDescriptionXce3be07e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eNoMatchException("InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormDescriptionXce3be07e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormDescriptionXce3be07e(element: JsonElement): InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c>()
  return InlineV1SubscriptionsPostRequestFormDescriptionXce3be07eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c = matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c) add("InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c: value does not match InlineV1SubscriptionsPostRequestFormDescriptionAnyOf2X29ab626c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
