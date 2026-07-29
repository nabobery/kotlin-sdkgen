package com.nabobery.sdkgen.github.generated

import kotlin.Int
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
 * Request to install an integration on a target
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/integration-installation-request
 */
@Serializable(with = IntegrationInstallationRequest.Serializer::class)
public class IntegrationInstallationRequest(
  public val account: InlineIntegrationInstallationRequestAccountX9999199b,
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val createdAt: String,
  /**
   * Unique identifier of the request installation.
   */
  public val id: Int,
  public val requester: SimpleUser,
  public val nodeId: String? = null,
) {
  public class Builder {
    private var accountValue: InlineIntegrationInstallationRequestAccountX9999199b? = null

    public var account: InlineIntegrationInstallationRequestAccountX9999199b
      get() = requireNotNull(accountValue) { "account is required" }
      set(`value`) {
        accountValue = value
      }

    private var createdAtValue: String? = null

    public var createdAt: String
      get() = requireNotNull(createdAtValue) { "createdAt is required" }
      set(`value`) {
        createdAtValue = value
      }

    private var idValue: Int? = null

    public var id: Int
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    private var requesterValue: SimpleUser? = null

    public var requester: SimpleUser
      get() = requireNotNull(requesterValue) { "requester is required" }
      set(`value`) {
        requesterValue = value
      }

    public var nodeId: String? = null

    public fun build(): IntegrationInstallationRequest {
      check(accountValue != null) { "account is required" }
      check(createdAtValue != null) { "createdAt is required" }
      check(idValue != null) { "id is required" }
      check(requesterValue != null) { "requester is required" }
      return IntegrationInstallationRequest(
        account = account,
        createdAt = createdAt,
        id = id,
        requester = requester,
        nodeId = nodeId,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): IntegrationInstallationRequest = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<IntegrationInstallationRequest> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): IntegrationInstallationRequest {
      val jsonDecoder = decoder.requireJsonDecoder("IntegrationInstallationRequest")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("IntegrationInstallationRequest must be a JSON object")
      val account = json.decodeRequired<InlineIntegrationInstallationRequestAccountX9999199b>(rawObject, "account")
      val createdAt = json.decodeRequired<String>(rawObject, "created_at")
      val id = json.decodeRequired<Int>(rawObject, "id")
      val requester = json.decodeRequired<SimpleUser>(rawObject, "requester")
      return IntegrationInstallationRequest(
        account = account,
        createdAt = createdAt,
        id = id,
        requester = requester,
        nodeId = rawObject["node_id"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: IntegrationInstallationRequest) {
      val jsonEncoder = encoder.requireJsonEncoder("IntegrationInstallationRequest")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("account", json.encodeToJsonElement(value.account))
        put("created_at", value.createdAt)
        put("id", json.encodeToJsonElement(value.id))
        put("requester", json.encodeToJsonElement(value.requester))
        value.nodeId?.let { put("node_id", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun integrationInstallationRequest(block: IntegrationInstallationRequest.Builder.() -> Unit): IntegrationInstallationRequest = IntegrationInstallationRequest.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("IntegrationInstallationRequest is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
