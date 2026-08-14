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

public enum class InlineChatUserMessageContentX51a5516aBranch {
  Branch1,
  Branch2,
}

public sealed class InlineChatUserMessageContentX51a5516aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineChatUserMessageContentX51a5516aNoMatchException(
  message: String,
) : InlineChatUserMessageContentX51a5516aDecodingException(message)

internal data class InlineChatUserMessageContentX51a5516aInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * User message content
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ChatUserMessage/properties/content
 */
@Serializable(with = InlineChatUserMessageContentX51a5516a.Serializer::class)
public class InlineChatUserMessageContentX51a5516a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChatUserMessageContentX51a5516aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<ChatContentItems>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<ChatContentItems>>(raw) else null }

  public val matchedBranches: Set<InlineChatUserMessageContentX51a5516aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChatUserMessageContentX51a5516aBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineChatUserMessageContentX51a5516aBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChatUserMessageContentX51a5516a {
      val inspection = inspectInlineChatUserMessageContentX51a5516a(raw)
      if (inspection.matchCount == 0) {
        throw InlineChatUserMessageContentX51a5516aNoMatchException("InlineChatUserMessageContentX51a5516a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChatUserMessageContentX51a5516a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChatUserMessageContentX51a5516a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChatUserMessageContentX51a5516a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChatUserMessageContentX51a5516a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChatUserMessageContentX51a5516a) {
      encoder.requireJsonEncoder("InlineChatUserMessageContentX51a5516a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChatUserMessageContentX51a5516a(element: JsonElement): InlineChatUserMessageContentX51a5516aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<ChatContentItems>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineChatUserMessageContentX51a5516aInspection(
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
