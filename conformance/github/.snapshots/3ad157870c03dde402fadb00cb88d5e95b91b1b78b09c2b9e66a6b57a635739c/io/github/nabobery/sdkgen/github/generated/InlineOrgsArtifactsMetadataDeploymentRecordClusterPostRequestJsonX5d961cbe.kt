package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema.
 *
 * Source:
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1artifacts~1metadata~1deployment-record~1cluster~1{cluster}/post/re
 * questBody/content/application~1json/schema
 */
@Serializable(with = InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe.Serializer::class)
public class InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe(
  deployments: List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143>,
  /**
   * The stage of the deployment.
   */
  public val logicalEnvironment: String,
  /**
   * The physical region of the deployment.
   */
  public val physicalEnvironment: String? = null,
  /**
   * If true, the endpoint will return the set records in the response body
   *
   */
  public val returnRecords: Boolean? = null,
) {
  /**
   * The list of deployments to record.
   */
  public val deployments:
      List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143> =
      deployments.toList()

  public class Builder {
    private var deploymentsValue:
        List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143>? = null

    public var deployments:
        List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143>
      get() = requireNotNull(deploymentsValue) { "deployments is required" }.toList()
      set(`value`) {
        deploymentsValue = value.toList()
      }

    private var logicalEnvironmentValue: String? = null

    public var logicalEnvironment: String
      get() = requireNotNull(logicalEnvironmentValue) { "logicalEnvironment is required" }
      set(`value`) {
        logicalEnvironmentValue = value
      }

    /**
     * The physical region of the deployment.
     */
    public var physicalEnvironment: String? = null

    /**
     * If true, the endpoint will return the set records in the response body
     *
     */
    public var returnRecords: Boolean? = null

    public fun build(): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe {
      check(deploymentsValue != null) { "deployments is required" }
      check(logicalEnvironmentValue != null) { "logicalEnvironment is required" }
      return InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe(
        deployments = deployments,
        logicalEnvironment = logicalEnvironment,
        physicalEnvironment = physicalEnvironment,
        returnRecords = returnRecords,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe must be a JSON object")
      val deployments = json.decodeRequired<List<InlineOrgsArtifactsMetadat390fPostRequestJsonDeploymentsItemX1d86c143>>(rawObject, "deployments")
      val logicalEnvironment = json.decodeRequired<String>(rawObject, "logical_environment")
      return InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe(
        deployments = deployments,
        logicalEnvironment = logicalEnvironment,
        physicalEnvironment = rawObject["physical_environment"]?.let { json.decodeFromJsonElement<String>(it) },
        returnRecords = rawObject["return_records"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("deployments", json.encodeToJsonElement(value.deployments))
        put("logical_environment", value.logicalEnvironment)
        value.physicalEnvironment?.let { put("physical_environment", it) }
        value.returnRecords?.let { put("return_records", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe(block: InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe.Builder.() -> Unit): InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe = InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineOrgsArtifactsMetadataDeploymentRecordClusterPostRequestJsonX5d961cbe is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
