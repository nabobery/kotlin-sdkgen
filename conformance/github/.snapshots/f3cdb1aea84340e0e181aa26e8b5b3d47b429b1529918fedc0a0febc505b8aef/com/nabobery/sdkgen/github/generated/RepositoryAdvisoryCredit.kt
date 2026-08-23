package com.nabobery.sdkgen.github.generated

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
 * A credit given to a user for a repository security advisory.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/repository-advisory-credit
 */
@Serializable(with = RepositoryAdvisoryCredit.Serializer::class)
public class RepositoryAdvisoryCredit(
  /**
   * The state of the user's acceptance of the credit.
   */
  public val state: InlineRepositoryAdvisoryCreditStateX08b1a651,
  public val type: SecurityAdvisoryCreditTypes,
  public val user: SimpleUser,
) {
  public class Builder {
    private var stateValue: InlineRepositoryAdvisoryCreditStateX08b1a651? = null

    public var state: InlineRepositoryAdvisoryCreditStateX08b1a651
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var typeValue: SecurityAdvisoryCreditTypes? = null

    public var type: SecurityAdvisoryCreditTypes
      get() = requireNotNull(typeValue) { "type is required" }
      set(`value`) {
        typeValue = value
      }

    private var userValue: SimpleUser? = null

    public var user: SimpleUser
      get() = requireNotNull(userValue) { "user is required" }
      set(`value`) {
        userValue = value
      }

    public fun build(): RepositoryAdvisoryCredit {
      check(stateValue != null) { "state is required" }
      check(typeValue != null) { "type is required" }
      check(userValue != null) { "user is required" }
      return RepositoryAdvisoryCredit(
        state = state,
        type = type,
        user = user,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RepositoryAdvisoryCredit = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RepositoryAdvisoryCredit> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RepositoryAdvisoryCredit {
      val jsonDecoder = decoder.requireJsonDecoder("RepositoryAdvisoryCredit")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RepositoryAdvisoryCredit must be a JSON object")
      val state = json.decodeRequired<InlineRepositoryAdvisoryCreditStateX08b1a651>(rawObject, "state")
      val type = json.decodeRequired<SecurityAdvisoryCreditTypes>(rawObject, "type")
      val user = json.decodeRequired<SimpleUser>(rawObject, "user")
      return RepositoryAdvisoryCredit(
        state = state,
        type = type,
        user = user,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RepositoryAdvisoryCredit) {
      val jsonEncoder = encoder.requireJsonEncoder("RepositoryAdvisoryCredit")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("state", json.encodeToJsonElement(value.state))
        put("type", json.encodeToJsonElement(value.type))
        put("user", json.encodeToJsonElement(value.user))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun repositoryAdvisoryCredit(block: RepositoryAdvisoryCredit.Builder.() -> Unit): RepositoryAdvisoryCredit = RepositoryAdvisoryCredit.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RepositoryAdvisoryCredit is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
