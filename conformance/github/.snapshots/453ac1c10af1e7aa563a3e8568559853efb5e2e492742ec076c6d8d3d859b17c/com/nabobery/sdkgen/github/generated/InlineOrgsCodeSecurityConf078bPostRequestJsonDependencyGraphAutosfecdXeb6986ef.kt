package com.nabobery.sdkgen.github.generated

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
 * sdkgen://source/openapi.yaml#/paths/~1orgs~1{org}~1code-security~1configurations/post/requestBody/content/application
 * ~1json/schema/properties/dependency_graph_autosubmit_action_options
 */
@Serializable(with = InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef.Serializer::class)
public class InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef(
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

    public fun build(): InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef = InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef(
      labeledRunners = labeledRunners,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef {
      val jsonDecoder = decoder.requireJsonDecoder("InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef must be a JSON object")
      return InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef(
        labeledRunners = rawObject["labeled_runners"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.labeledRunners?.let { put("labeled_runners", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef(block: InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef.Builder.() -> Unit): InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef = InlineOrgsCodeSecurityConf078bPostRequestJsonDependencyGraphAutosfecdXeb6986ef.build(block)
