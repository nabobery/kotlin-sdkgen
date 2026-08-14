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

public enum class InlineV1IssuingTokensGetParameterX07e41bcaBranch {
  InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c,
  Branch2,
}

public sealed class InlineV1IssuingTokensGetParameterX07e41bcaDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1IssuingTokensGetParameterX07e41bcaNoMatchException(
  message: String,
) : InlineV1IssuingTokensGetParameterX07e41bcaDecodingException(message)

internal data class InlineV1IssuingTokensGetParameterX07e41bcaInspection(
  public val matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c, matchesBranch2).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1issuing~1tokens/get/parameters/1/schema
 */
@Serializable(with = InlineV1IssuingTokensGetParameterX07e41bca.Serializer::class)
public class InlineV1IssuingTokensGetParameterX07e41bca internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1IssuingTokensGetParameterX07e41bcaInspection,
) {
  public val inlineV1IssuingTokensGetParameterAnyOf1X63f77a2c:
      InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c) json.decodeFromJsonElement<InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c>(raw) else null }

  public val branch2: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<Int>(raw) else null }

  public val matchedBranches: Set<InlineV1IssuingTokensGetParameterX07e41bcaBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c) add(InlineV1IssuingTokensGetParameterX07e41bcaBranch.InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c)
      if (inspection.matchesBranch2) add(InlineV1IssuingTokensGetParameterX07e41bcaBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1IssuingTokensGetParameterX07e41bca {
      val inspection = inspectInlineV1IssuingTokensGetParameterX07e41bca(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1IssuingTokensGetParameterX07e41bcaNoMatchException("InlineV1IssuingTokensGetParameterX07e41bca matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1IssuingTokensGetParameterX07e41bca(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1IssuingTokensGetParameterX07e41bca> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingTokensGetParameterX07e41bca {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingTokensGetParameterX07e41bca")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingTokensGetParameterX07e41bca) {
      encoder.requireJsonEncoder("InlineV1IssuingTokensGetParameterX07e41bca").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1IssuingTokensGetParameterX07e41bca(element: JsonElement): InlineV1IssuingTokensGetParameterX07e41bcaInspection {
  val matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c = element.isJsonDecodable<InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c>()
  val matchesBranch2 = element.isJsonDecodable<Int>()
  return InlineV1IssuingTokensGetParameterX07e41bcaInspection(
    matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c = matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1IssuingTokensGetParameterAnyOf1X63f77a2c) add("InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c: value does not match InlineV1IssuingTokensGetParameterAnyOf1X63f77a2c")
      if (!matchesBranch2) add("Branch2: value does not match Int")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
