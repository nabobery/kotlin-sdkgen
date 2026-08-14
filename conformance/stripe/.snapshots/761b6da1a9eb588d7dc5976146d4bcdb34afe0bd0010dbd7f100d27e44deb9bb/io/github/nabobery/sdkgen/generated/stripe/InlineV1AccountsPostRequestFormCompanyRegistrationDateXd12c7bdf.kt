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

public enum class InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfBranch {
  InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a,
  InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12,
}

public sealed class InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfNoMatchException(
  message: String,
) : InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfDecodingException(message)

internal data class InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfInspection(
  public val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a: Boolean,
  public val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a, matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/registration_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1accounts/post/requestBody/content/application~1x-www-form-urlencoded/schema
 * /properties/company/properties/registration_date
 */
@Serializable(with = InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf.Serializer::class)
public class InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfInspection,
) {
  public val inlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a:
      InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a>(raw) else null }

  public val inlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12:
      InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12) json.decodeFromJsonElement<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12>(raw) else null }

  public val matchedBranches:
      Set<InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a) add(InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfBranch.InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a)
      if (inspection.matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12) add(InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfBranch.InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf {
      val inspection = inspectInlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfNoMatchException("InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf) {
      encoder.requireJsonEncoder("InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdf(element: JsonElement): InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfInspection {
  val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a = element.isJsonDecodable<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a>()
  val matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12 = element.isJsonDecodable<InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12>()
  return InlineV1AccountsPostRequestFormCompanyRegistrationDateXd12c7bdfInspection(
    matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a = matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a,
    matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12 = matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12,
    failures = buildList {
      if (!matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a) add("InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a: value does not match InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf1X73ea318a")
      if (!matchesInlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12) add("InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12: value does not match InlineV1AccountsPostRequestFormCompanyRegistrationDateAnyOf2X2ab90b12")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
