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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/self-hosted-runners-settings.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/self-hosted-runners-settings
 */
@Serializable(with = SelfHostedRunnersSettings.Serializer::class)
public class SelfHostedRunnersSettings(
  /**
   * The policy that controls whether self-hosted runners can be used by repositories in the organization
   */
  public val enabledRepositories: InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6,
  /**
   * The URL to the endpoint for managing selected repositories for self-hosted runners in the organization
   */
  public val selectedRepositoriesUrl: String? = null,
) {
  public class Builder {
    private var enabledRepositoriesValue:
        InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6? = null

    public var enabledRepositories: InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6
      get() = requireNotNull(enabledRepositoriesValue) { "enabledRepositories is required" }
      set(`value`) {
        enabledRepositoriesValue = value
      }

    /**
     * The URL to the endpoint for managing selected repositories for self-hosted runners in the organization
     */
    public var selectedRepositoriesUrl: String? = null

    public fun build(): SelfHostedRunnersSettings {
      check(enabledRepositoriesValue != null) { "enabledRepositories is required" }
      return SelfHostedRunnersSettings(
        enabledRepositories = enabledRepositories,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): SelfHostedRunnersSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<SelfHostedRunnersSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SelfHostedRunnersSettings {
      val jsonDecoder = decoder.requireJsonDecoder("SelfHostedRunnersSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("SelfHostedRunnersSettings must be a JSON object")
      val enabledRepositories = json.decodeRequired<InlineSelfHostedRunnersSettingsEnabledRepositoriesX99d426d6>(rawObject, "enabled_repositories")
      return SelfHostedRunnersSettings(
        enabledRepositories = enabledRepositories,
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: SelfHostedRunnersSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("SelfHostedRunnersSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enabled_repositories", json.encodeToJsonElement(value.enabledRepositories))
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun selfHostedRunnersSettings(block: SelfHostedRunnersSettings.Builder.() -> Unit): SelfHostedRunnersSettings = SelfHostedRunnersSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("SelfHostedRunnersSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
