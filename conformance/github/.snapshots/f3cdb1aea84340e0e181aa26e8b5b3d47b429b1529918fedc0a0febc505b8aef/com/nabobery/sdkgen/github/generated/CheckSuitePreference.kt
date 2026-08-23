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
 * Check suite configuration preferences for a repository.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/check-suite-preference
 */
@Serializable(with = CheckSuitePreference.Serializer::class)
public class CheckSuitePreference(
  public val preferences: InlineCheckSuitePreferencePreferencesX4fcefa9d,
  public val repository: MinimalRepository,
) {
  public class Builder {
    private var preferencesValue: InlineCheckSuitePreferencePreferencesX4fcefa9d? = null

    public var preferences: InlineCheckSuitePreferencePreferencesX4fcefa9d
      get() = requireNotNull(preferencesValue) { "preferences is required" }
      set(`value`) {
        preferencesValue = value
      }

    private var repositoryValue: MinimalRepository? = null

    public var repository: MinimalRepository
      get() = requireNotNull(repositoryValue) { "repository is required" }
      set(`value`) {
        repositoryValue = value
      }

    public fun build(): CheckSuitePreference {
      check(preferencesValue != null) { "preferences is required" }
      check(repositoryValue != null) { "repository is required" }
      return CheckSuitePreference(
        preferences = preferences,
        repository = repository,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CheckSuitePreference = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CheckSuitePreference> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CheckSuitePreference {
      val jsonDecoder = decoder.requireJsonDecoder("CheckSuitePreference")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CheckSuitePreference must be a JSON object")
      val preferences = json.decodeRequired<InlineCheckSuitePreferencePreferencesX4fcefa9d>(rawObject, "preferences")
      val repository = json.decodeRequired<MinimalRepository>(rawObject, "repository")
      return CheckSuitePreference(
        preferences = preferences,
        repository = repository,
      )
    }

    override fun serialize(encoder: Encoder, `value`: CheckSuitePreference) {
      val jsonEncoder = encoder.requireJsonEncoder("CheckSuitePreference")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("preferences", json.encodeToJsonElement(value.preferences))
        put("repository", json.encodeToJsonElement(value.repository))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun checkSuitePreference(block: CheckSuitePreference.Builder.() -> Unit): CheckSuitePreference = CheckSuitePreference.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CheckSuitePreference is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
