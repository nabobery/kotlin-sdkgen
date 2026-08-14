package io.github.nabobery.sdkgen.generated

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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineChatDeveloperMessageContentX72a11979Branch {
  Branch1,
  Branch2,
}

public sealed class InlineChatDeveloperMessageContentX72a11979DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChatDeveloperMessageContentX72a11979NoMatchException(
  message: String,
) : InlineChatDeveloperMessageContentX72a11979DecodingException(message)

internal data class InlineChatDeveloperMessageContentX72a11979Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Developer message content
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatDeveloperMessage/properties/content
 */
@Serializable(with = InlineChatDeveloperMessageContentX72a11979.Serializer::class)
public class InlineChatDeveloperMessageContentX72a11979 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChatDeveloperMessageContentX72a11979Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentText>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<ChatContentText>>(raw) else null }

  public val matchedBranches: Set<InlineChatDeveloperMessageContentX72a11979Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChatDeveloperMessageContentX72a11979Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineChatDeveloperMessageContentX72a11979Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChatDeveloperMessageContentX72a11979 {
      val inspection = inspectInlineChatDeveloperMessageContentX72a11979(raw)
      if (inspection.matchCount == 0) {
        throw InlineChatDeveloperMessageContentX72a11979NoMatchException("InlineChatDeveloperMessageContentX72a11979 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChatDeveloperMessageContentX72a11979(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChatDeveloperMessageContentX72a11979> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatDeveloperMessageContentX72a11979 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatDeveloperMessageContentX72a11979")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatDeveloperMessageContentX72a11979) {
      encoder.requireJsonEncoder("InlineChatDeveloperMessageContentX72a11979").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChatDeveloperMessageContentX72a11979(element: JsonElement): InlineChatDeveloperMessageContentX72a11979Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentText>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineChatDeveloperMessageContentX72a11979Inspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesBranch2) add("Branch2: value does not match List")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
