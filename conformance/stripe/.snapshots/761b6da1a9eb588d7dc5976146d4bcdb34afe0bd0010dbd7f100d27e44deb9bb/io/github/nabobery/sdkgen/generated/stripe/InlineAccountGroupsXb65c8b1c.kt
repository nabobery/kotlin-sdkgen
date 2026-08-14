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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineAccountGroupsXb65c8b1cBranch {
  AccountGroupMembership,
}

public sealed class InlineAccountGroupsXb65c8b1cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountGroupsXb65c8b1cNoMatchException(
  message: String,
) : InlineAccountGroupsXb65c8b1cDecodingException(message)

internal data class InlineAccountGroupsXb65c8b1cInspection(
  public val matchesAccountGroupMembership: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAccountGroupMembership).count { it }
}

/**
 * The groups associated with the account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/groups
 */
@Serializable(with = InlineAccountGroupsXb65c8b1c.Serializer::class)
public class InlineAccountGroupsXb65c8b1c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountGroupsXb65c8b1cInspection,
) {
  public val accountGroupMembership: AccountGroupMembershipView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccountGroupMembership) json.decodeFromJsonElement<AccountGroupMembershipView>(raw) else null }

  public val matchedBranches: Set<InlineAccountGroupsXb65c8b1cBranch>
    get() = buildSet {
      if (inspection.matchesAccountGroupMembership) add(InlineAccountGroupsXb65c8b1cBranch.AccountGroupMembership)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountGroupsXb65c8b1c {
      val inspection = inspectInlineAccountGroupsXb65c8b1c(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountGroupsXb65c8b1cNoMatchException("InlineAccountGroupsXb65c8b1c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountGroupsXb65c8b1c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAccountGroupsXb65c8b1c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountGroupsXb65c8b1c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountGroupsXb65c8b1c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountGroupsXb65c8b1c) {
      encoder.requireJsonEncoder("InlineAccountGroupsXb65c8b1c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountGroupsXb65c8b1c(element: JsonElement): InlineAccountGroupsXb65c8b1cInspection {
  val raw = element as? JsonObject ?: return InlineAccountGroupsXb65c8b1cInspection(
    matchesAccountGroupMembership = false,
    failures = listOf("AccountGroupMembership: expected JSON object"),
  )
  val matchesAccountGroupMembership = true
  return InlineAccountGroupsXb65c8b1cInspection(
    matchesAccountGroupMembership = matchesAccountGroupMembership,
    failures = buildList {
      if (!matchesAccountGroupMembership) add("AccountGroupMembership: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
