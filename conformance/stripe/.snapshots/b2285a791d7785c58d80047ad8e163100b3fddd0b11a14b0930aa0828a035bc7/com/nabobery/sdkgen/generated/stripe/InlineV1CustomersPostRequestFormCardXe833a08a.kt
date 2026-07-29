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

public enum class InlineV1CustomersPostRequestFormCardXe833a08aBranch {
  InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0,
  Branch2,
}

public sealed class InlineV1CustomersPostRequestFormCardXe833a08aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormCardXe833a08aNoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormCardXe833a08aDecodingException(message)

internal data class InlineV1CustomersPostRequestFormCardXe833a08aInspection(
  public val matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0, matchesBranch2).count { it }
}

/**
 * A token, like the ones returned by [Stripe.js](https://stripe.com/docs/js).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/card
 */
@Serializable(with = InlineV1CustomersPostRequestFormCardXe833a08a.Serializer::class)
public class InlineV1CustomersPostRequestFormCardXe833a08a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormCardXe833a08aInspection,
) {
  public val inlineV1CustomersPostRequestFormCardAnyOf1X55954ea0:
      InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormCardXe833a08aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0) add(InlineV1CustomersPostRequestFormCardXe833a08aBranch.InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0)
      if (inspection.matchesBranch2) add(InlineV1CustomersPostRequestFormCardXe833a08aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormCardXe833a08a {
      val inspection = inspectInlineV1CustomersPostRequestFormCardXe833a08a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormCardXe833a08aNoMatchException("InlineV1CustomersPostRequestFormCardXe833a08a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormCardXe833a08a(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersPostRequestFormCardXe833a08a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormCardXe833a08a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormCardXe833a08a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormCardXe833a08a) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormCardXe833a08a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormCardXe833a08a(element: JsonElement): InlineV1CustomersPostRequestFormCardXe833a08aInspection {
  val matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0 = element.isJsonDecodable<InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersPostRequestFormCardXe833a08aInspection(
    matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0 = matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersPostRequestFormCardAnyOf1X55954ea0) add("InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0: value does not match InlineV1CustomersPostRequestFormCardAnyOf1X55954ea0")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
