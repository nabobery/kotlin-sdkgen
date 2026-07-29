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

public enum class InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bBranch {
  InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075,
  Branch2,
}

public sealed class InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bNoMatchException(
  message: String,
) : InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bDecodingException(message)

internal data class InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bInspection(
  public val matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075, matchesBranch2).count { it }
}

/**
 * Time at which the registration becomes active. It can be either `now` to indicate the current time, or a timestamp
 * measured in seconds since the Unix epoch.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations~1{id}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/active_from
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bInspection,
) {
  public val inlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075:
      InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075) json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075) add(InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bBranch.InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075)
      if (inspection.matchesBranch2) add(InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b {
      val inspection = inspectInlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bNoMatchException("InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b) {
      encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b(element: JsonElement): InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bInspection {
  val matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075 = element.isJsonDecodable<InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779bInspection(
    matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075 = matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075) add("InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075: value does not match InlineV1TaxRegistrationsPostRequestFormActiveFromAnyOf1X54af9075")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
