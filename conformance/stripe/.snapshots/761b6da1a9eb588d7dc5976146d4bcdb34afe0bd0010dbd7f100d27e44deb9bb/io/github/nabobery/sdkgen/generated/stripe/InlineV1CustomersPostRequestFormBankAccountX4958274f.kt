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

public enum class InlineV1CustomersPostRequestFormBankAccountX4958274fBranch {
  InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6,
  Branch2,
}

public sealed class InlineV1CustomersPostRequestFormBankAccountX4958274fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersPostRequestFormBankAccountX4958274fNoMatchException(
  message: String,
) : InlineV1CustomersPostRequestFormBankAccountX4958274fDecodingException(message)

internal data class InlineV1CustomersPostRequestFormBankAccountX4958274fInspection(
  public val matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6: Boolean,
  public val matchesBranch2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6, matchesBranch2).count { it }
}

/**
 * Either a token, like the ones returned by [Stripe.js](https://stripe.com/docs/js), or a dictionary containing a
 * user's bank account details.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}/post/requestBody/content/application~1x-www-form-urle
 * ncoded/schema/properties/bank_account
 */
@Serializable(with = InlineV1CustomersPostRequestFormBankAccountX4958274f.Serializer::class)
public class InlineV1CustomersPostRequestFormBankAccountX4958274f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1CustomersPostRequestFormBankAccountX4958274fInspection,
) {
  public val inlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6:
      InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6) json.decodeFromJsonElement<InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6>(raw) else null }

  public val branch2: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<String>(raw) else null }

  public val matchedBranches: Set<InlineV1CustomersPostRequestFormBankAccountX4958274fBranch>
    get() = buildSet {
      if (inspection.matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6) add(InlineV1CustomersPostRequestFormBankAccountX4958274fBranch.InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6)
      if (inspection.matchesBranch2) add(InlineV1CustomersPostRequestFormBankAccountX4958274fBranch.Branch2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersPostRequestFormBankAccountX4958274f {
      val inspection = inspectInlineV1CustomersPostRequestFormBankAccountX4958274f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersPostRequestFormBankAccountX4958274fNoMatchException("InlineV1CustomersPostRequestFormBankAccountX4958274f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersPostRequestFormBankAccountX4958274f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersPostRequestFormBankAccountX4958274f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersPostRequestFormBankAccountX4958274f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersPostRequestFormBankAccountX4958274f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersPostRequestFormBankAccountX4958274f) {
      encoder.requireJsonEncoder("InlineV1CustomersPostRequestFormBankAccountX4958274f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersPostRequestFormBankAccountX4958274f(element: JsonElement): InlineV1CustomersPostRequestFormBankAccountX4958274fInspection {
  val matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6 = element.isJsonDecodable<InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6>()
  val matchesBranch2 = element.isJsonDecodable<String>()
  return InlineV1CustomersPostRequestFormBankAccountX4958274fInspection(
    matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6 = matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6,
    matchesBranch2 = matchesBranch2,
    failures = buildList {
      if (!matchesInlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6) add("InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6: value does not match InlineV1CustomersPostRequestFormBankAccountAnyOf1Xe90aabe6")
      if (!matchesBranch2) add("Branch2: value does not match String")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
