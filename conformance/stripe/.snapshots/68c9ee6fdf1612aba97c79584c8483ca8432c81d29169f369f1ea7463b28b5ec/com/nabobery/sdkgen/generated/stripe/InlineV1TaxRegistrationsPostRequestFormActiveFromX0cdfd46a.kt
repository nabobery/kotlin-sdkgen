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

public enum class InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aBranch {
  InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40,
  Branch2,
}

public sealed class InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aNoMatchException(
  message: String,
) : InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aDecodingException(message)

internal data class InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aInspection(
  public val matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40, matchesBranch2).count { it }
}

/**
 * Time at which the Tax Registration becomes active. It can be either `now` to indicate the current time, or a future
 * timestamp measured in seconds since the Unix epoch.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/active_from
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aInspection,
) {
  public val inlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40:
      InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40) json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40) add(InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aBranch.InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40)
      if (inspection.matchesBranch2) add(InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a {
      val inspection = inspectInlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aNoMatchException("InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a) {
      encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46a(element: JsonElement): InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aInspection {
  val matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40 = element.isJsonDecodable<InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TaxRegistrationsPostRequestFormActiveFromX0cdfd46aInspection(
    matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40 = matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40) add("InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40: value does not match InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X0ed5ab40")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
