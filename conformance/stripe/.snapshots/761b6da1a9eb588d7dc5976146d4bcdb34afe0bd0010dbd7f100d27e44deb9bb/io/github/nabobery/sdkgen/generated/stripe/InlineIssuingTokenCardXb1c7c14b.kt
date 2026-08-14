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

public enum class InlineIssuingTokenCardXb1c7c14bBranch {
  Branch1,
  IssuingCard,
}

public sealed class InlineIssuingTokenCardXb1c7c14bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingTokenCardXb1c7c14bNoMatchException(
  message: String,
) : InlineIssuingTokenCardXb1c7c14bDecodingException(message)

internal data class InlineIssuingTokenCardXb1c7c14bInspection(
  public val matchesBranch1: Boolean,
  public val matchesIssuingCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesIssuingCard).count { it }
}

/**
 * Card associated with this token.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.token/properties/card
 */
@Serializable(with = InlineIssuingTokenCardXb1c7c14b.Serializer::class)
public class InlineIssuingTokenCardXb1c7c14b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingTokenCardXb1c7c14bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val issuingCard: IssuingCard? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCard) json.decodeFromJsonElement<IssuingCard>(raw) else null }

  public val matchedBranches: Set<InlineIssuingTokenCardXb1c7c14bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineIssuingTokenCardXb1c7c14bBranch.Branch1)
      if (inspection.matchesIssuingCard) add(InlineIssuingTokenCardXb1c7c14bBranch.IssuingCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingTokenCardXb1c7c14b {
      val inspection = inspectInlineIssuingTokenCardXb1c7c14b(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingTokenCardXb1c7c14bNoMatchException("InlineIssuingTokenCardXb1c7c14b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingTokenCardXb1c7c14b(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingTokenCardXb1c7c14b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingTokenCardXb1c7c14b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingTokenCardXb1c7c14b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingTokenCardXb1c7c14b) {
      encoder.requireJsonEncoder("InlineIssuingTokenCardXb1c7c14b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingTokenCardXb1c7c14b(element: JsonElement): InlineIssuingTokenCardXb1c7c14bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesIssuingCard = element.isJsonDecodable<IssuingCard>()
  return InlineIssuingTokenCardXb1c7c14bInspection(
    matchesBranch1 = matchesBranch1,
    matchesIssuingCard = matchesIssuingCard,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesIssuingCard) add("IssuingCard: value does not match IssuingCard")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
