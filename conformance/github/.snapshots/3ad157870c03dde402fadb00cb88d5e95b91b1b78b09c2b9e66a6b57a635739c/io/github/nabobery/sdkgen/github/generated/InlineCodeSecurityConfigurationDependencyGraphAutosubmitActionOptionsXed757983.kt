package io.github.nabobery.sdkgen.github.generated

import kotlin.Boolean
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Feature options for Automatic dependency submission
 *
 * Source:
 * sdkgen://source/openapi.yaml#/components/schemas/code-security-configuration/properties/dependency_graph_autosubmit_a
 * ction_options
 */
@Serializable(with = InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983.Serializer::class)
public class InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983(
  /**
   * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
   */
  public val labeledRunners: Boolean? = null,
) {
  public class Builder {
    /**
     * Whether to use runners labeled with 'dependency-submission' or standard GitHub runners.
     */
    public var labeledRunners: Boolean? = null

    public fun build(): InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983 = InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983(
      labeledRunners = labeledRunners,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983 must be a JSON object")
      return InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983(
        labeledRunners = rawObject["labeled_runners"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labeledRunners?.let { put("labeled_runners", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983(block: InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983.Builder.() -> Unit): InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983 = InlineCodeSecurityConfigurationDependencyGraphAutosubmitActionOptionsXed757983.build(block)
