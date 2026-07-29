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

public enum class InlineV1TerminalReadersPostRequestFormLabelX28f772fdBranch {
  Branch1,
  InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172,
}

public sealed class InlineV1TerminalReadersPostRequestFormLabelX28f772fdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TerminalReadersPostRequestFormLabelX28f772fdNoMatchException(
  message: String,
) : InlineV1TerminalReadersPostRequestFormLabelX28f772fdDecodingException(message)

internal data class InlineV1TerminalReadersPostRequestFormLabelX28f772fdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172).count { it }
}

/**
 * The new label of the reader.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1terminal~1readers~1{reader}/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/label
 */
@Serializable(with = InlineV1TerminalReadersPostRequestFormLabelX28f772fd.Serializer::class)
public class InlineV1TerminalReadersPostRequestFormLabelX28f772fd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1TerminalReadersPostRequestFormLabelX28f772fdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172:
      InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172) json.decodeFromJsonElement<InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172>(raw) else null }

  public val matchedBranches: Set<InlineV1TerminalReadersPostRequestFormLabelX28f772fdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TerminalReadersPostRequestFormLabelX28f772fdBranch.Branch1)
      if (inspection.matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172) add(InlineV1TerminalReadersPostRequestFormLabelX28f772fdBranch.InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TerminalReadersPostRequestFormLabelX28f772fd {
      val inspection = inspectInlineV1TerminalReadersPostRequestFormLabelX28f772fd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TerminalReadersPostRequestFormLabelX28f772fdNoMatchException("InlineV1TerminalReadersPostRequestFormLabelX28f772fd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TerminalReadersPostRequestFormLabelX28f772fd(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1TerminalReadersPostRequestFormLabelX28f772fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TerminalReadersPostRequestFormLabelX28f772fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TerminalReadersPostRequestFormLabelX28f772fd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TerminalReadersPostRequestFormLabelX28f772fd) {
      encoder.requireJsonEncoder("InlineV1TerminalReadersPostRequestFormLabelX28f772fd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TerminalReadersPostRequestFormLabelX28f772fd(element: JsonElement): InlineV1TerminalReadersPostRequestFormLabelX28f772fdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172 = element.isJsonDecodable<InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172>()
  return InlineV1TerminalReadersPostRequestFormLabelX28f772fdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172 = matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172) add("InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172: value does not match InlineV1TerminalReadersPostRequestFormLabelAnyOf2X13e6c172")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
