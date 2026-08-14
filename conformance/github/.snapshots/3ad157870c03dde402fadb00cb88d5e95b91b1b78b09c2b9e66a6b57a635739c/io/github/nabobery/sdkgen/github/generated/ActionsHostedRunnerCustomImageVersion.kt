package io.github.nabobery.sdkgen.github.generated

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
 * Provides details of a hosted runner custom image version
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/actions-hosted-runner-custom-image-version
 */
@Serializable(with = ActionsHostedRunnerCustomImageVersion.Serializer::class)
public class ActionsHostedRunnerCustomImageVersion(
  /**
   * The creation date time of the image version.
   */
  public val createdOn: String,
  /**
   * Image version size in GB.
   */
  public val sizeGb: Int,
  /**
   * The state of image version.
   */
  public val state: String,
  /**
   * The image version status details.
   */
  public val stateDetails: String,
  /**
   * The version of image.
   */
  public val version: String,
) {
  public class Builder {
    private var createdOnValue: String? = null

    public var createdOn: String
      get() = requireNotNull(createdOnValue) { "createdOn is required" }
      set(`value`) {
        createdOnValue = value
      }

    private var sizeGbValue: Int? = null

    public var sizeGb: Int
      get() = requireNotNull(sizeGbValue) { "sizeGb is required" }
      set(`value`) {
        sizeGbValue = value
      }

    private var stateValue: String? = null

    public var state: String
      get() = requireNotNull(stateValue) { "state is required" }
      set(`value`) {
        stateValue = value
      }

    private var stateDetailsValue: String? = null

    public var stateDetails: String
      get() = requireNotNull(stateDetailsValue) { "stateDetails is required" }
      set(`value`) {
        stateDetailsValue = value
      }

    private var versionValue: String? = null

    public var version: String
      get() = requireNotNull(versionValue) { "version is required" }
      set(`value`) {
        versionValue = value
      }

    public fun build(): ActionsHostedRunnerCustomImageVersion {
      check(createdOnValue != null) { "createdOn is required" }
      check(sizeGbValue != null) { "sizeGb is required" }
      check(stateValue != null) { "state is required" }
      check(stateDetailsValue != null) { "stateDetails is required" }
      check(versionValue != null) { "version is required" }
      return ActionsHostedRunnerCustomImageVersion(
        createdOn = createdOn,
        sizeGb = sizeGb,
        state = state,
        stateDetails = stateDetails,
        version = version,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ActionsHostedRunnerCustomImageVersion = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ActionsHostedRunnerCustomImageVersion> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ActionsHostedRunnerCustomImageVersion {
      val jsonDecoder = decoder.requireJsonDecoder("ActionsHostedRunnerCustomImageVersion")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ActionsHostedRunnerCustomImageVersion must be a JSON object")
      val createdOn = json.decodeRequired<String>(rawObject, "created_on")
      val sizeGb = json.decodeRequired<Int>(rawObject, "size_gb")
      val state = json.decodeRequired<String>(rawObject, "state")
      val stateDetails = json.decodeRequired<String>(rawObject, "state_details")
      val version = json.decodeRequired<String>(rawObject, "version")
      return ActionsHostedRunnerCustomImageVersion(
        createdOn = createdOn,
        sizeGb = sizeGb,
        state = state,
        stateDetails = stateDetails,
        version = version,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ActionsHostedRunnerCustomImageVersion) {
      val jsonEncoder = encoder.requireJsonEncoder("ActionsHostedRunnerCustomImageVersion")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("created_on", value.createdOn)
        put("size_gb", json.encodeToJsonElement(value.sizeGb))
        put("state", value.state)
        put("state_details", value.stateDetails)
        put("version", value.version)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun actionsHostedRunnerCustomImageVersion(block: ActionsHostedRunnerCustomImageVersion.Builder.() -> Unit): ActionsHostedRunnerCustomImageVersion = ActionsHostedRunnerCustomImageVersion.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ActionsHostedRunnerCustomImageVersion is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
