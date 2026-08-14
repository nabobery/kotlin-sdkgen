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
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCodeInterpreterServerToolContainerX490ea590Branch {
  Branch1,
  InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f,
}

public sealed class InlineCodeInterpreterServerToolContainerX490ea590DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCodeInterpreterServerToolContainerX490ea590NoMatchException(
  message: String,
) : InlineCodeInterpreterServerToolContainerX490ea590DecodingException(message)

internal data class InlineCodeInterpreterServerToolContainerX490ea590Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/CodeInterpreterServerTool/properties/container
 */
@Serializable(with = InlineCodeInterpreterServerToolContainerX490ea590.Serializer::class)
public class InlineCodeInterpreterServerToolContainerX490ea590 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCodeInterpreterServerToolContainerX490ea590Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineCodeInterpreterServerToolContainerAnyOf2X67a9454f:
      InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f) json.decodeFromJsonElement<InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f>(raw) else null }

  public val matchedBranches: Set<InlineCodeInterpreterServerToolContainerX490ea590Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCodeInterpreterServerToolContainerX490ea590Branch.Branch1)
      if (inspection.matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f) add(InlineCodeInterpreterServerToolContainerX490ea590Branch.InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCodeInterpreterServerToolContainerX490ea590 {
      val inspection = inspectInlineCodeInterpreterServerToolContainerX490ea590(raw)
      if (inspection.matchCount == 0) {
        throw InlineCodeInterpreterServerToolContainerX490ea590NoMatchException("InlineCodeInterpreterServerToolContainerX490ea590 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCodeInterpreterServerToolContainerX490ea590(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCodeInterpreterServerToolContainerX490ea590> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeInterpreterServerToolContainerX490ea590 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeInterpreterServerToolContainerX490ea590")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeInterpreterServerToolContainerX490ea590) {
      encoder.requireJsonEncoder("InlineCodeInterpreterServerToolContainerX490ea590").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCodeInterpreterServerToolContainerX490ea590(element: JsonElement): InlineCodeInterpreterServerToolContainerX490ea590Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f = element.isJsonDecodable<InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f>()
  return InlineCodeInterpreterServerToolContainerX490ea590Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f = matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineCodeInterpreterServerToolContainerAnyOf2X67a9454f) add("InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f: value does not match InlineCodeInterpreterServerToolContainerAnyOf2X67a9454f")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
