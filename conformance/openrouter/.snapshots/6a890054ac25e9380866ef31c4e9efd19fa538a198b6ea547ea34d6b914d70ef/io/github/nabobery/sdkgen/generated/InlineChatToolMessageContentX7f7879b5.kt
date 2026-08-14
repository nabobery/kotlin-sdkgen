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

public enum class InlineChatToolMessageContentX7f7879b5Branch {
  Branch1,
  Branch2,
}

public sealed class InlineChatToolMessageContentX7f7879b5DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChatToolMessageContentX7f7879b5NoMatchException(
  message: String,
) : InlineChatToolMessageContentX7f7879b5DecodingException(message)

internal data class InlineChatToolMessageContentX7f7879b5Inspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Tool response content
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatToolMessage/properties/content
 */
@Serializable(with = InlineChatToolMessageContentX7f7879b5.Serializer::class)
public class InlineChatToolMessageContentX7f7879b5 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChatToolMessageContentX7f7879b5Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentItems>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<ChatContentItems>>(raw) else null }

  public val matchedBranches: Set<InlineChatToolMessageContentX7f7879b5Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChatToolMessageContentX7f7879b5Branch.Branch1)
      if (inspection.matchesBranch2) add(InlineChatToolMessageContentX7f7879b5Branch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChatToolMessageContentX7f7879b5 {
      val inspection = inspectInlineChatToolMessageContentX7f7879b5(raw)
      if (inspection.matchCount == 0) {
        throw InlineChatToolMessageContentX7f7879b5NoMatchException("InlineChatToolMessageContentX7f7879b5 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChatToolMessageContentX7f7879b5(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChatToolMessageContentX7f7879b5> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatToolMessageContentX7f7879b5 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatToolMessageContentX7f7879b5")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatToolMessageContentX7f7879b5) {
      encoder.requireJsonEncoder("InlineChatToolMessageContentX7f7879b5").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChatToolMessageContentX7f7879b5(element: JsonElement): InlineChatToolMessageContentX7f7879b5Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentItems>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineChatToolMessageContentX7f7879b5Inspection(
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
