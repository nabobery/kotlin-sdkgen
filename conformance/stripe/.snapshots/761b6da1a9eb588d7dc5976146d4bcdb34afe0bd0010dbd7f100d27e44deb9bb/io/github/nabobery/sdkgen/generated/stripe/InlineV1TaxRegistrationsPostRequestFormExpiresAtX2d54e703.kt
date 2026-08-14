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

public enum class InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Branch {
  InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7,
  Branch2,
  InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28,
}

public sealed class InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703NoMatchException(
  message: String,
) : InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703DecodingException(message)

internal data class InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Inspection(
  public val matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7, matchesBranch2, matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28).count { it }
}

/**
 * If set, the registration stops being active at this time. If not set, the registration will be active indefinitely.
 * It can be either `now` to indicate the current time, or a timestamp measured in seconds since the Unix epoch.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations~1{id}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/expires_at
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Inspection,
) {
  public val inlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7:
      InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7) json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28:
      InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28) json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28>(raw) else null }

  public val matchedBranches: Set<InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Branch>
    get() = buildSet {
      if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7) add(InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Branch.InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7)
      if (inspection.matchesBranch2) add(InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Branch.Branch2)
      if (inspection.matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28) add(InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Branch.InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703 {
      val inspection = inspectInlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703NoMatchException("InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703) {
      encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703(element: JsonElement): InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Inspection {
  val matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7 = element.isJsonDecodable<InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  val matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28 = element.isJsonDecodable<InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28>()
  return InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703Inspection(
    matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7 = matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7,
    matchesBranch2 = matchesBranch2,
    matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28 = matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28,
    failures = buildList {
      if (!matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7) add("InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7: value does not match InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf1X5f8edac7")
      if (!matchesBranch2) add("Branch2: value does not match Int")
      if (!matchesInlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28) add("InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28: value does not match InlineV1TaxRegistrationsPostRequestFormExpiresAtAnyOf3X89e67c28")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
