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

public enum class InlineMessagesMessageParamContentX36d98fdaBranch {
  Branch1,
  Branch2,
}

public sealed class InlineMessagesMessageParamContentX36d98fdaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineMessagesMessageParamContentX36d98fdaNoMatchException(
  message: String,
) : InlineMessagesMessageParamContentX36d98fdaDecodingException(message)

internal data class InlineMessagesMessageParamContentX36d98fdaInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/MessagesMessageParam/properties/content
 */
@Serializable(with = InlineMessagesMessageParamContentX36d98fda.Serializer::class)
public class InlineMessagesMessageParamContentX36d98fda internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineMessagesMessageParamContentX36d98fdaInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val branch2: List<InlineMessagesMessageParamContentAnyOf2ItemX7923ff96>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<List<InlineMessagesMessageParamContentAnyOf2ItemX7923ff96>>(raw) else null }

  public val matchedBranches: Set<InlineMessagesMessageParamContentX36d98fdaBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineMessagesMessageParamContentX36d98fdaBranch.Branch1)
      if (inspection.matchesBranch2) add(InlineMessagesMessageParamContentX36d98fdaBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineMessagesMessageParamContentX36d98fda {
      val inspection = inspectInlineMessagesMessageParamContentX36d98fda(raw)
      if (inspection.matchCount == 0) {
        throw InlineMessagesMessageParamContentX36d98fdaNoMatchException("InlineMessagesMessageParamContentX36d98fda matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineMessagesMessageParamContentX36d98fda(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineMessagesMessageParamContentX36d98fda> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMessagesMessageParamContentX36d98fda {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMessagesMessageParamContentX36d98fda")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineMessagesMessageParamContentX36d98fda) {
      encoder.requireJsonEncoder("InlineMessagesMessageParamContentX36d98fda").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineMessagesMessageParamContentX36d98fda(element: JsonElement): InlineMessagesMessageParamContentX36d98fdaInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesBranch2 = element.isJsonDecodable<List<InlineMessagesMessageParamContentAnyOf2ItemX7923ff96>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  return InlineMessagesMessageParamContentX36d98fdaInspection(
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
