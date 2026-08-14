package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Double
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

public enum class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dBranch {
  Branch1,
  InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3,
}

public sealed class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dNoMatchException(
  message: String,
) : InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dDecodingException(message)

internal data class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/relationship/properties/percent_ownership.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1persons~1{person}/post/requestBody/content/application
 * ~1x-www-form-urlencoded/schema/properties/relationship/properties/percent_ownership
 */
@Serializable(with = InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d.Serializer::class)
public class InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dInspection,
) {
  public val branch1: Double? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Double>(raw) else null }

  public val inlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3:
      InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3) json.decodeFromJsonElement<InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dBranch.Branch1)
      if (inspection.matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3) add(InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dBranch.InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d {
      val inspection = inspectInlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dNoMatchException("InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d) {
      encoder.requireJsonEncoder("InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122d(element: JsonElement): InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dInspection {
  val matchesBranch1 = element.isJsonDecodable<Double>()
  val matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3 = element.isJsonDecodable<InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3>()
  return InlineV1AccountsPersonsPostRequestFormRelationshipPercentOwnershipXeddc122dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3 = matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Double")
      if (!matchesInlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3) add("InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3: value does not match InlineV1AccountsPersonsPostRequestFormRelationshipAnyOf2X66b480a3")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
