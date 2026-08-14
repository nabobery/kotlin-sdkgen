package io.github.nabobery.sdkgen.github.generated

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
 * Check immutable releases settings for an organization.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/immutable-releases-organization-settings
 */
@Serializable(with = ImmutableReleasesOrganizationSettings.Serializer::class)
public class ImmutableReleasesOrganizationSettings(
  /**
   * The policy that controls how immutable releases are enforced in the organization.
   */
  public val enforcedRepositories:
      InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07,
  /**
   * The API URL to use to get or set the selected repositories for immutable releases enforcement, when
   * `enforced_repositories` is set to `selected`.
   */
  public val selectedRepositoriesUrl: String? = null,
) {
  public class Builder {
    private var enforcedRepositoriesValue:
        InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07? = null

    public var enforcedRepositories:
        InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07
      get() = requireNotNull(enforcedRepositoriesValue) { "enforcedRepositories is required" }
      set(`value`) {
        enforcedRepositoriesValue = value
      }

    /**
     * The API URL to use to get or set the selected repositories for immutable releases enforcement, when
     * `enforced_repositories` is set to `selected`.
     */
    public var selectedRepositoriesUrl: String? = null

    public fun build(): ImmutableReleasesOrganizationSettings {
      check(enforcedRepositoriesValue != null) { "enforcedRepositories is required" }
      return ImmutableReleasesOrganizationSettings(
        enforcedRepositories = enforcedRepositories,
        selectedRepositoriesUrl = selectedRepositoriesUrl,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ImmutableReleasesOrganizationSettings = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ImmutableReleasesOrganizationSettings> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ImmutableReleasesOrganizationSettings {
      val jsonDecoder = decoder.requireJsonDecoder("ImmutableReleasesOrganizationSettings")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ImmutableReleasesOrganizationSettings must be a JSON object")
      val enforcedRepositories = json.decodeRequired<InlineImmutableReleasesOrganizationSettingsEnforcedRepositoriesX02106a07>(rawObject, "enforced_repositories")
      return ImmutableReleasesOrganizationSettings(
        enforcedRepositories = enforcedRepositories,
        selectedRepositoriesUrl = rawObject["selected_repositories_url"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ImmutableReleasesOrganizationSettings) {
      val jsonEncoder = encoder.requireJsonEncoder("ImmutableReleasesOrganizationSettings")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("enforced_repositories", json.encodeToJsonElement(value.enforcedRepositories))
        value.selectedRepositoriesUrl?.let { put("selected_repositories_url", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun immutableReleasesOrganizationSettings(block: ImmutableReleasesOrganizationSettings.Builder.() -> Unit): ImmutableReleasesOrganizationSettings = ImmutableReleasesOrganizationSettings.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ImmutableReleasesOrganizationSettings is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
