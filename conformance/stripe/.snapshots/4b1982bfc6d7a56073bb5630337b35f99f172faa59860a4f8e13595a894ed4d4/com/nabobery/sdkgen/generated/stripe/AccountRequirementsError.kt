package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account_requirements_error
 */
@Serializable(with = AccountRequirementsError.Serializer::class)
public class AccountRequirementsError(
  /**
   * The code for the type of error.
   */
  public val code: InlineAccountRequirementsErrorCodeX13a67bc5,
  /**
   * An informative message that indicates the error type and provides additional details about the error.
   */
  public val reason: String,
  /**
   * The specific user onboarding requirement field (in the requirements hash) that needs to be resolved.
   */
  public val requirement: String,
) {
  public class Builder {
    private var codeValue: InlineAccountRequirementsErrorCodeX13a67bc5? = null

    public var code: InlineAccountRequirementsErrorCodeX13a67bc5
      get() = requireNotNull(codeValue) { "code is required" }
      set(`value`) {
        codeValue = value
      }

    private var reasonValue: String? = null

    public var reason: String
      get() = requireNotNull(reasonValue) { "reason is required" }
      set(`value`) {
        reasonValue = value
      }

    private var requirementValue: String? = null

    public var requirement: String
      get() = requireNotNull(requirementValue) { "requirement is required" }
      set(`value`) {
        requirementValue = value
      }

    public fun build(): AccountRequirementsError {
      check(codeValue != null) { "code is required" }
      check(reasonValue != null) { "reason is required" }
      check(requirementValue != null) { "requirement is required" }
      return AccountRequirementsError(
        code = code,
        reason = reason,
        requirement = requirement,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): AccountRequirementsError = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<AccountRequirementsError> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): AccountRequirementsError {
      val jsonDecoder = decoder.requireJsonDecoder("AccountRequirementsError")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("AccountRequirementsError must be a JSON object")
      val code = json.decodeRequired<InlineAccountRequirementsErrorCodeX13a67bc5>(rawObject, "code")
      val reason = json.decodeRequired<String>(rawObject, "reason")
      val requirement = json.decodeRequired<String>(rawObject, "requirement")
      return AccountRequirementsError(
        code = code,
        reason = reason,
        requirement = requirement,
      )
    }

    override fun serialize(encoder: Encoder, `value`: AccountRequirementsError) {
      val jsonEncoder = encoder.requireJsonEncoder("AccountRequirementsError")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("code", json.encodeToJsonElement(value.code))
        put("reason", value.reason)
        put("requirement", value.requirement)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun accountRequirementsError(block: AccountRequirementsError.Builder.() -> Unit): AccountRequirementsError = AccountRequirementsError.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("AccountRequirementsError is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
