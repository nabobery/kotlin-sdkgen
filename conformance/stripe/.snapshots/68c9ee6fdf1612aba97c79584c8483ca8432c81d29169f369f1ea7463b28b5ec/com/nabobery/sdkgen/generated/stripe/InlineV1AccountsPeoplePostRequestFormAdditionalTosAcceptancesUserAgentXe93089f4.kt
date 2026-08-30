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

public enum class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Branch {
  Branch1,
  InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798,
}

public sealed class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4NoMatchException(
  message: String,
) : InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4DecodingException(message)

internal data class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/additional_tos_acceptances/properties/account/properties/user_agent.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts~1{account}~1people/post/requestBody/content/application~1x-www-for
 * m-urlencoded/schema/properties/additional_tos_acceptances/properties/account/properties/user_agent
 */
@Serializable(with = InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4.Serializer::class)
public class InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798:
      InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798) json.decodeFromJsonElement<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Branch.Branch1)
      if (inspection.matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798) add(InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Branch.InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4 {
      val inspection = inspectInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4NoMatchException("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4) {
      encoder.requireJsonEncoder("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4(element: JsonElement): InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798 = element.isJsonDecodable<InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798>()
  return InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesUserAgentXe93089f4Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798 = matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798) add("InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798: value does not match InlineV1AccountsPeoplePostRequestFormAdditionalTosAcceptancesAnyOf2Xa8569798")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
