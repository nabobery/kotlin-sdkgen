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
 * Generated model for
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners/put/requestBody/content/
 * application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1actions~1permissions~1self-hosted-runners/put/requestBody/content/
 * application~1json/schema
 */
@Serializable(with = InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029.Serializer::class)
public class InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029(
  /**
   * The policy that controls whether self-hosted runners can be used in the organization
   */
  public val enabledRepositories:
      InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1,
) {
  public class Builder {
    private var enabledRepositoriesValue:
        InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1? = null

    public var enabledRepositories:
        InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1
      get() = requireNotNull(enabledRepositoriesValue) { "enabledRepositories is required" }
      set(`value`) {
        enabledRepositoriesValue = value
      }

    public fun build(): InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029 {
      check(enabledRepositoriesValue != null) { "enabledRepositories is required" }
      return InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029(
        enabledRepositories = enabledRepositories,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029 must be a JSON object")
      val enabledRepositories = json.decodeRequired<InlineOrgsActionsPermissio7a6aPutRequestJsonEnabledRepositoriesX784c77a1>(rawObject, "enabled_repositories")
      return InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029(
        enabledRepositories = enabledRepositories,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_repositories", json.encodeToJsonElement(value.enabledRepositories))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029(block: InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029.Builder.() -> Unit): InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029 = InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsActionsPermissionsSelfHostedRunnersPutRequestJsonXc714f029 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
