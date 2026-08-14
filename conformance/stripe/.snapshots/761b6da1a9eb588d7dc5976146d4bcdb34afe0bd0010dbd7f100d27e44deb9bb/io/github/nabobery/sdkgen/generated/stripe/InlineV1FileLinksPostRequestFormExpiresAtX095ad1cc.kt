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

public enum class InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccBranch {
  InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773,
  Branch2,
  InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb,
}

public sealed class InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccNoMatchException(
  message: String,
) : InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccDecodingException(message)

internal data class InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccInspection(
  public val matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773, matchesBranch2, matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb).count { it }
}

/**
 * A future timestamp after which the link will no longer be usable, or `now` to expire the link immediately.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1file_links~1{link}/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/expires_at
 */
@Serializable(with = InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc.Serializer::class)
public class InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccInspection,
) {
  public val inlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773:
      InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773) json.decodeFromJsonElement<InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb:
      InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb) json.decodeFromJsonElement<InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb>(raw) else null }

  public val matchedBranches: Set<InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773) add(InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccBranch.InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773)
      if (inspection.matchesBranch2) add(InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccBranch.Branch2)
      if (inspection.matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb) add(InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccBranch.InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc {
      val inspection = inspectInlineV1FileLinksPostRequestFormExpiresAtX095ad1cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccNoMatchException("InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc) {
      encoder.requireJsonEncoder("InlineV1FileLinksPostRequestFormExpiresAtX095ad1cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1FileLinksPostRequestFormExpiresAtX095ad1cc(element: JsonElement): InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccInspection {
  val matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773 = element.isJsonDecodable<InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  val matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb = element.isJsonDecodable<InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb>()
  return InlineV1FileLinksPostRequestFormExpiresAtX095ad1ccInspection(
    matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773 = matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773,
    matchesBranch2 = matchesBranch2,
    matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb = matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb,
    failures = buildList {
      if (!matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773) add("InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773: value does not match InlineV1FileLinksPostRequestFormExpiresAtAnyOf1X4ea58773")
      if (!matchesBranch2) add("Branch2: value does not match Int")
      if (!matchesInlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb) add("InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb: value does not match InlineV1FileLinksPostRequestFormExpiresAtAnyOf3X8e622adb")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
